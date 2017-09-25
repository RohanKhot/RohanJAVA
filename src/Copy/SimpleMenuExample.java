package Copy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rohan on 11/9/17.
 */
public class SimpleMenuExample extends Frame implements ActionListener
{
    Menu states, cities;
    public SimpleMenuExample()
    {
        MenuBar mb = new MenuBar();		        // begin with creating menu bar
        setMenuBar(mb);				// add menu bar to frame

        states = new Menu("Indian States");		// create menus
        cities = new Menu("Indian Cities");

        mb.add(states);				// add menus to menu bar
        mb.add(cities);

        states.addActionListener(this);		// link with ActionListener for event handling
        cities.addActionListener(this);

        states.add(new MenuItem("Himachal Pradesh"));
        states.add(new MenuItem("Rajasthan"));
        states.add(new MenuItem("West Bengal"));
        states.addSeparator();			// separates from north Indian states from south Indian
        states.add(new MenuItem("Andhra Pradesh"));
        states.add(new MenuItem("Tamilnadu"));
        states.add(new MenuItem("Karnataka"));

        cities.add(new MenuItem("Delhi"));
        cities.add(new MenuItem("Jaipur"));
        cities.add(new MenuItem("Kolkata"));
        cities.addSeparator();			// separates north Indian cities from south Indian
        cities.add(new MenuItem("Hyderabad"));
        cities.add(new MenuItem("Chennai"));
        cities.add(new MenuItem("Bengaluru"));

        setTitle("Simple Menu Program");		// frame creation methods
        setSize(300, 300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String str = e.getActionCommand();		// know the menu item selected by the user
        System.out.println("You selected " + str);
    }
    public static void main(String args[])
    {
        new SimpleMenuExample();
    }
}