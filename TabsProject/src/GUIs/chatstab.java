package GUIs;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import profiletab.profilestab;

/**
 *
 * @author Michelle Marie Garcia
 * 
 * This class creates a tab pane with three tabs in total. The first tab holds
 * the previous project on sorting profiles. The second tab is empty and would
 * hold classes entered belonging to a profile. The third and final tab holds a
 * simple about page. Each tab has an icon beside its title.
 */
public class chatstab {
    private TabPane tabPane = new TabPane();
    private Image img1 = new Image("imgs/open.gif");
    private Image img2 = new Image("imgs/save.gif");
    
    public chatstab(){
        tabPane.setStyle("-fx-background-color: cornsilk;");
        
        Tab tab1 = new Tab("Profiles");
        tab1.idProperty().set("Profiles");
        tab1.setClosable(false);
        tab1.setGraphic(new ImageView(img1));
        tab1.setStyle("-fx-border-color: navy; -fx-background-color: bisque;");
        tab1.setContent(new profilestab());
        
        Tab tab2 = new Tab("Courses");
        tab2.idProperty().set("Courses");
        tab2.setClosable(false);
        tab2.setGraphic(new ImageView(img2));
        tab2.setStyle("-fx-border-color: navy; -fx-background-color: bisque;");
        tab2.setContent(null);
        
        Tab tab3 = new Tab("About");
        tab3.setClosable(false);
        tab3.setStyle("-fx-border-color: navy; -fx-background-color: bisque;");
        
        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        webEngine.load(getClass().getResource("/aboutHTML/aboutstab.html").toString());
        tab3.setContent(browser);
        
        tabPane.getTabs().addAll(tab1, tab2, tab3);
    }

    /**
     * @return the tabPane
     */
    public TabPane getTabPane() {
        return tabPane;
    }

    /**
     * @param tabPane the tabPane to set
     */
    public void setTabPane(TabPane tabPane) {
        this.tabPane = tabPane;
    }
}