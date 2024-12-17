package hust.soict.hedspi.aims.screen;
import hust.soict.hedspi.aims.cart.PhucNH_Cart;
import hust.soict.hedspi.aims.media.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhucNH_MediaStore extends JPanel {
	private static final long serialVersionUID = 5926811251941464262L;

	public PhucNH_MediaStore(PhucNH_Media media, PhucNH_Cart myCart) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(),Font.PLAIN,20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" +media.getCost() + "$");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton btnAdd = new JButton("Add to cart");
        container.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myCart.addMedia(media);
            }
        });

        if(media instanceof PhucNH_Playable) {
            JButton playBtn= new JButton("Play");
            playBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JDialog playDialog = createPlayDialog(media);
                    playDialog.setVisible(true);
                    playDialog.setSize(300,200);
                    playDialog.pack();
                }
            });
            container.add(playBtn);
        }
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    static JDialog createPlayDialog(PhucNH_Media media) {
        JDialog playDialog = new JDialog();
        Container container = playDialog.getContentPane();
        playDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        container.add(Box.createRigidArea(new Dimension(10,10)));
        if(media instanceof PhucNH_DigitalVideoDisc dvd) {
            container.add(new JLabel("Playing DVD:" + dvd.getTitle()));
            container.add(new JLabel("DVD length:" + dvd.getLength() +" min"));
        } else if (media instanceof PhucNH_CompactDisc cd) {
            container.add(new JLabel("Title: " + cd.getTitle()));
            container.add(new JLabel("Artist: " + cd.getArtist()));
            for (PhucNH_Track track : cd.getTracks()) {
                container.add(new JLabel("Play: " + track.getTitle() + ". Length: " + track.getLength() + " min"));
            }
        }
        playDialog.setTitle("Play " + media.getTitle());
        return playDialog;
    }
}