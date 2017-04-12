package profiletab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Michelle Marie Garcia
 * 
 * This class creates the content within the Profile tab. Within this class, a
 * GUI is created along with the necessary classes needed for the GUI to function.
 */
public class profilestab extends BorderPane {
    ArrayList<Profile> profiles = new ArrayList<>();
    ArrayList<Courses> courses = new ArrayList<>();
    ListView<Profile> profilesView = new ListView();

    /**
     * Default constructor calling method to create GUI
     */
    public profilestab() {
        getGUI();
    }

    /**
     * This method creates the BorderPane GUI
     */
    public void getGUI() {
        this.setPadding(new Insets(20, 10, 10, 10));
        createUItopPanel();
        createUIbottomPanel();
        createUIleftPanel();
        createUIrightPanel();
        createUIcenterPanel();
    }

    /**
     * This method creates the topPanel of the BorderPane GUI
     */
    private void createUItopPanel() {
        Label topLabel = new Label(" VaqChat UTRGV ");
        topLabel.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 40));
        topLabel.setTextFill(Color.CORAL);
        topLabel.setWrapText(true);

        topLabel.setBorder(new Border(new BorderStroke(Color.DARKBLUE, BorderStrokeStyle.SOLID, new CornerRadii(3), new BorderWidths(2))));
        topLabel.setTextAlignment(TextAlignment.CENTER);

        Separator separator = new Separator();
        separator.setMinSize(20, 20);
        separator.setOrientation(Orientation.HORIZONTAL);

        VBox topVB = new VBox();
        topVB.setAlignment(Pos.CENTER);
        topVB.getChildren().addAll(topLabel, separator);
        BorderPane.setAlignment(topVB, Pos.CENTER);

        this.setTop(topVB);
    }

    /**
     * This method creates the bottom panel
     */
    private void createUIbottomPanel() {
        Button addProfileButton = new Button("Add");
        addProfileButton.setMaxWidth(Double.MAX_VALUE);
        addProfileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getProfile();
            }
        });

        Button modifyProfileButton = new Button("Modify");
        modifyProfileButton.setMaxWidth(Double.MAX_VALUE);
        modifyProfileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Modify
            }
        });

        Button deleteProfileButton = new Button("Delete");
        deleteProfileButton.setMaxWidth(Double.MAX_VALUE);
        deleteProfileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Delete
            }
        });

        HBox buttonHBox = new HBox();
        buttonHBox.setAlignment(Pos.TOP_CENTER);
        buttonHBox.setPadding(new Insets(50, 50, 50, 50));
        buttonHBox.getChildren().addAll(addProfileButton, modifyProfileButton, deleteProfileButton);
        BorderPane.setAlignment(buttonHBox, Pos.TOP_CENTER);

        this.setBottom(buttonHBox);
    }

    /**
     * This method creates the left panel
     */
    private void createUIleftPanel() {
        GridPane profileEntryGrid = new GridPane();
        profileEntryGrid.setVgap(5);
        profileEntryGrid.setHgap(5);
        profileEntryGrid.setPadding(new Insets(5, 5, 5, 5));

        Label studentInfoLabel = new Label("Student Info");
        studentInfoLabel.setStyle("-fx-font-weight: bold;");
        Label courseInfoLabel = new Label("Course Info");
        courseInfoLabel.setStyle("-fx-font-weight: bold;");

        Label unameLabel = new Label("Username:");
        TextField unameField = new TextField();
        unameField.setId("uname");
        unameField.setMaxWidth(Double.MAX_VALUE);

        Label fnameLabel = new Label("First Name:");
        TextField fnameField = new TextField();
        fnameField.setId("fname");
        fnameField.setMaxWidth(Double.MAX_VALUE);

        Label lnameLabel = new Label("Last Name:");
        TextField lnameField = new TextField();
        lnameField.setId("lname");
        lnameField.setMaxWidth(Double.MAX_VALUE);

        Label idLabel = new Label("Id:");
        TextField idField = new TextField();
        idField.setId("id");
        idField.setMaxWidth(Double.MAX_VALUE);

        Label dobLabel = new Label("D.O.B.:");
        TextField dobField = new TextField();
        dobField.setId("dob");
        dobField.setMaxWidth(Double.MAX_VALUE);

        Label imgLabel = new Label("Image Name:");
        TextField imgField = new TextField();
        imgField.setId("img");
        imgField.setMaxWidth(Double.MAX_VALUE);

        Label emailLabel = new Label("Enter Email:");
        TextField emailField = new TextField();
        emailField.setId("mail");
        emailField.setMaxWidth(Double.MAX_VALUE);

        Label address1Label = new Label("Address1:");
        TextField address1Field = new TextField();
        address1Field.setId("address1");
        address1Field.setMaxWidth(Double.MAX_VALUE);

        Label address2Label = new Label("Address2:");
        TextField address2Field = new TextField();
        address2Field.setId("address2");
        address2Field.setMaxWidth(Double.MAX_VALUE);

        Label cityLabel = new Label("City:");
        TextField cityField = new TextField();
        cityField.setId("city");
        cityField.setMaxWidth(Double.MAX_VALUE);

        Label stateLabel = new Label("State:");
        TextField stateField = new TextField();
        stateField.setId("state");
        stateField.setMaxWidth(Double.MAX_VALUE);

        Label zipLabel = new Label("Zip Code:");
        TextField zipField = new TextField();
        zipField.setId("zip");
        zipField.setMaxWidth(Double.MAX_VALUE);

        Label homeLabel = new Label("Home Phone:");
        TextField homeField = new TextField();
        homeField.setId("home");
        homeField.setMaxWidth(Double.MAX_VALUE);

        Label workLabel = new Label("Work Phone:");
        TextField workField = new TextField();
        workField.setId("work");
        workField.setMaxWidth(Double.MAX_VALUE);

        Label cellLabel = new Label("Cell Phone:");
        TextField cellField = new TextField();
        cellField.setId("cell");
        cellField.setMaxWidth(Double.MAX_VALUE);

        Label urlLabel = new Label("Web URL:");
        TextField urlField = new TextField();
        urlField.setId("url");
        urlField.setMaxWidth(Double.MAX_VALUE);

        Label cidLabel = new Label("Course ID:");
        TextField cidField = new TextField();
        cidField.setId("cid");
        cidField.setMaxWidth(Double.MAX_VALUE);

        Label prefixLabel = new Label("Prefix:");
        TextField prefixField = new TextField();
        prefixField.setId("prefix");
        prefixField.setMaxWidth(Double.MAX_VALUE);

        Label cnumLabel = new Label("Course Number:");
        TextField cnumField = new TextField();
        cnumField.setId("cnum");
        cnumField.setMaxWidth(Double.MAX_VALUE);

        Label sectionLabel = new Label("Section:");
        TextField sectionField = new TextField();
        sectionField.setId("section");
        sectionField.setMaxWidth(Double.MAX_VALUE);

        Label startLabel = new Label("Start Time:");
        TextField startField = new TextField();
        startField.setId("start");
        startField.setMaxWidth(Double.MAX_VALUE);

        Label endLabel = new Label("End Time:");
        TextField endField = new TextField();
        endField.setId("end");
        endField.setMaxWidth(Double.MAX_VALUE);

        Label locationLabel = new Label("Location:");
        TextField locationField = new TextField();
        locationField.setId("location");
        locationField.setMaxWidth(Double.MAX_VALUE);

        Label instLabel = new Label("Instructor:");
        TextField instField = new TextField();
        instField.setId("inst");
        instField.setMaxWidth(Double.MAX_VALUE);

        Label prenumLabel = new Label("Prereq. Number:");
        TextField prenumField = new TextField();
        prenumField.setId("prenum");
        prenumField.setMaxWidth(Double.MAX_VALUE);

        Separator separator2 = new Separator();
        separator2.setMinSize(20, 20);
        separator2.setOrientation(Orientation.VERTICAL);

        profileEntryGrid.add(studentInfoLabel, 0, 0);
        profileEntryGrid.add(unameLabel, 0, 1);
        profileEntryGrid.add(unameField, 1, 1);
        profileEntryGrid.add(fnameLabel, 0, 2);
        profileEntryGrid.add(fnameField, 1, 2);
        profileEntryGrid.add(lnameLabel, 0, 3);
        profileEntryGrid.add(lnameField, 1, 3);
        profileEntryGrid.add(idLabel, 0, 4);
        profileEntryGrid.add(idField, 1, 4);
        profileEntryGrid.add(dobLabel, 0, 5);
        profileEntryGrid.add(dobField, 1, 5);
        profileEntryGrid.add(imgLabel, 0, 6);
        profileEntryGrid.add(imgField, 1, 6);
        profileEntryGrid.add(emailLabel, 0, 7);
        profileEntryGrid.add(emailField, 1, 7);
        profileEntryGrid.add(address1Label, 0, 8);
        profileEntryGrid.add(address1Field, 1, 8);
        profileEntryGrid.add(address2Label, 0, 9);
        profileEntryGrid.add(address2Field, 1, 9);
        profileEntryGrid.add(cityLabel, 0, 10);
        profileEntryGrid.add(cityField, 1, 10);
        profileEntryGrid.add(stateLabel, 0, 11);
        profileEntryGrid.add(stateField, 1, 11);
        profileEntryGrid.add(zipLabel, 0, 12);
        profileEntryGrid.add(zipField, 1, 12);
        profileEntryGrid.add(homeLabel, 0, 13);
        profileEntryGrid.add(homeField, 1, 13);
        profileEntryGrid.add(workLabel, 0, 14);
        profileEntryGrid.add(workField, 1, 14);
        profileEntryGrid.add(cellLabel, 0, 15);
        profileEntryGrid.add(cellField, 1, 15);
        profileEntryGrid.add(urlLabel, 0, 16);
        profileEntryGrid.add(urlField, 1, 16);

        profileEntryGrid.add(courseInfoLabel, 2, 0);
        profileEntryGrid.add(cidLabel, 2, 1);
        profileEntryGrid.add(cidField, 3, 1);
        profileEntryGrid.add(prefixLabel, 2, 2);
        profileEntryGrid.add(prefixField, 3, 2);
        profileEntryGrid.add(cnumLabel, 2, 3);
        profileEntryGrid.add(cnumField, 3, 3);
        profileEntryGrid.add(sectionLabel, 2, 4);
        profileEntryGrid.add(sectionField, 3, 4);
        profileEntryGrid.add(startLabel, 2, 5);
        profileEntryGrid.add(startField, 3, 5);
        profileEntryGrid.add(endLabel, 2, 6);
        profileEntryGrid.add(endField, 3, 6);
        profileEntryGrid.add(locationLabel, 2, 7);
        profileEntryGrid.add(locationField, 3, 7);
        profileEntryGrid.add(instLabel, 2, 8);
        profileEntryGrid.add(instField, 3, 8);
        profileEntryGrid.add(prenumLabel, 2, 9);
        profileEntryGrid.add(prenumField, 3, 9);

        HBox leftHBox = new HBox();
        leftHBox.getChildren().addAll(profileEntryGrid, separator2);
        leftHBox.setAlignment(Pos.TOP_CENTER);
        BorderPane.setAlignment(leftHBox, Pos.TOP_CENTER);

        this.setLeft(leftHBox);
    }

    /**
     * This method creates the right panel
     */
    private void createUIrightPanel() {
        Separator separator3 = new Separator();
        separator3.setMinSize(20, 20);
        separator3.setOrientation(Orientation.VERTICAL);

        HBox rightHBox2 = new HBox();
        rightHBox2.getChildren().addAll(separator3, getListView());

        VBox rightVBox = new VBox();
        rightVBox.setAlignment(Pos.TOP_CENTER);
        rightVBox.getChildren().addAll(rightHBox2);
        BorderPane.setAlignment(rightVBox, Pos.TOP_CENTER);

        this.setRight(rightVBox);
    }

    /**
     * This method creates the center panel
     */
    private void createUIcenterPanel() {
        MenuItem menuItem1 = new MenuItem("First Name");
        menuItem1.setId("mi1");
        menuItem1.setOnAction(e -> {
            Collections.sort(profiles, new FirstNameComparator());
            profilesView.getItems().clear();
            profilesView.getItems().addAll(profiles);
        });
        MenuItem menuItem2 = new MenuItem("Last Name");
        menuItem2.setId("mi2");
        menuItem2.setOnAction(e -> {
            Collections.sort(profiles, new LastNameComparator());
            profilesView.getItems().clear();
            profilesView.getItems().addAll(profiles);
        });
        MenuItem menuItem3 = new MenuItem("ID");
        menuItem3.setId("mi3");
        menuItem3.setOnAction(e -> {
            Collections.sort(profiles, new IDComparator());
            profilesView.getItems().clear();
            profilesView.getItems().addAll(profiles);
        });
        MenuItem menuItem4 = new MenuItem("Email");
        menuItem4.setId("mi4");
        menuItem4.setOnAction(e -> {
            Collections.sort(profiles, new EmailComparator());
            profilesView.getItems().clear();
            profilesView.getItems().addAll(profiles);
        });

        MenuButton dropdown = new MenuButton("Select", null, menuItem1, menuItem2, menuItem3, menuItem4);

        HBox middleHBox = new HBox(10);
        middleHBox.setPadding(new Insets(5, 5, 5, 5));
        middleHBox.setAlignment(Pos.TOP_CENTER);
        middleHBox.getChildren().addAll(new Label("Sort By: "), dropdown);

        this.setCenter(middleHBox);
    }

    /**
     * 
     * @return s the profilesView that holds the profiles inputed by the user
     */
    public ListView<Profile> getListView() {
        return profilesView;
    }

    /**
     * This method retrieves data and sets it to a newly created profile
     */
    public void getProfile() {
        Profile profile1 = new Profile();
        Scene scene = this.getScene();

        TextField Txuname = (TextField) scene.lookup("#uname");
        TextField Txfname = (TextField) scene.lookup("#fname");
        TextField Txlname = (TextField) scene.lookup("#lname");
        TextField Txid = (TextField) scene.lookup("#id");
        TextField Txdob = (TextField) scene.lookup("#dob");
        TextField Tximg = (TextField) scene.lookup("#img");
        TextField Txmail = (TextField) scene.lookup("#mail");
        TextField Txaddress1 = (TextField) scene.lookup("#address1");
        TextField Txaddress2 = (TextField) scene.lookup("#address2");
        TextField Txcity = (TextField) scene.lookup("#city");
        TextField Txstate = (TextField) scene.lookup("#state");
        TextField Txzip = (TextField) scene.lookup("#zip");
        TextField Txhome = (TextField) scene.lookup("#home");
        TextField Txwork = (TextField) scene.lookup("#work");
        TextField Txcell = (TextField) scene.lookup("#cell");
        TextField Txurl = (TextField) scene.lookup("#url");

        TextField Txcid = (TextField) scene.lookup("#cid");
        TextField Txprefix = (TextField) scene.lookup("#prefix");
        TextField Txcnum = (TextField) scene.lookup("#cnum");
        TextField Txsection = (TextField) scene.lookup("#section");
        TextField Txstart = (TextField) scene.lookup("#start");
        TextField Txend = (TextField) scene.lookup("#end");
        TextField Txlocation = (TextField) scene.lookup("#location");
        TextField Txinst = (TextField) scene.lookup("#inst");
        TextField Txprenum = (TextField) scene.lookup("#prenum");

        profile1.setPerson(new Person(Txfname.getText(), Txlname.getText(), Txid.getText(),
                Txdob.getText(), Tximg.getText(), Txmail.getText(), Txaddress1.getText(),
                Txaddress2.getText(), Txcity.getText(), Txstate.getText(), Txzip.getText(),
                Txhome.getText(), Txwork.getText(), Txcell.getText(), Txurl.getText()));
        profile1.setScreenName(Txuname.getText());
        profile1.setCurrentCourses(new Courses(Txcid.getText(), Txprefix.getText(),
                Txcnum.getText(), Txsection.getText(), Txstart.getText(), Txend.getText(),
                Txlocation.getText(), Txinst.getText(), Txprenum.getText()));

        profiles.add(profile1);
//--------------------------------------------------------------------------------
        profilesView.getItems().clear();
        profilesView.getItems().addAll(profiles);

        Txuname.setText("");
        Txfname.setText("");
        Txlname.setText("");
        Txid.setText("");
        Txdob.setText("");
        Tximg.setText("");
        Txmail.setText("");
        Txaddress1.setText("");
        Txaddress2.setText("");
        Txcity.setText("");
        Txstate.setText("");
        Txzip.setText("");
        Txhome.setText("");
        Txwork.setText("");
        Txcell.setText("");
        Txurl.setText("");
        Txcid.setText("");
        Txprefix.setText("");
        Txcnum.setText("");
        Txsection.setText("");
        Txstart.setText("");
        Txend.setText("");
        Txlocation.setText("");
        Txinst.setText("");
        Txprenum.setText("");
    }

    /**
     * This class sorts by first name
     */
    class FirstNameComparator implements Comparator<Profile> {

        @Override
        public int compare(Profile pf1, Profile pf2) {
            String fname1 = pf1.getPerson().getFirstName();
            String fname2 = pf2.getPerson().getFirstName();
            return fname1.compareTo(fname2);
        }
    }

    /**
     * This class sorts by last name
     */
    class LastNameComparator implements Comparator<Profile> {

        @Override
        public int compare(Profile pf1, Profile pf2) {
            String lname1 = pf1.getPerson().getLastName();
            String lname2 = pf2.getPerson().getLastName();
            return lname1.compareTo(lname2);
        }
    }

    /**
     * This class sorts by ID
     */
    class IDComparator implements Comparator<Profile> {

        @Override
        public int compare(Profile pf1, Profile pf2) {
            String id1 = pf1.getPerson().getId();
            String id2 = pf2.getPerson().getId();
            return id1.compareTo(id2);
        }
    }

    /**
     * This class sorts by Email
     */
    class EmailComparator implements Comparator<Profile> {

        @Override
        public int compare(Profile pf1, Profile pf2) {
            String email1 = pf1.getPerson().getEmail();
            String email2 = pf2.getPerson().getEmail();
            return email1.compareTo(email2);
        }
    }
}

/**
 * 
 * @author Michelle Marie Garcia
 * 
 * This class creates a Courses object to hold a person's courses
 */
class Courses {
    private String courseId;
    private String prefix;
    private String courseNum;
    private String section;
    private String startTime;
    private String endTime;
    private String location;
    private String instructor;
    private String prereq;

    /**
     * 
     * @param courseId
     * @param prefix
     * @param courseNum
     * @param section 
     * 
     * This constructor takes only certain fields
     */
    public Courses(String courseId, String prefix, String courseNum, String section) {
        this.courseId = courseId;
        this.prefix = prefix;
        this.courseNum = courseNum;
        this.section = section;
    }

    /**
     * 
     * @param courseId
     * @param prefix
     * @param courseNum
     * @param section
     * @param startTime
     * @param endTime
     * @param location
     * @param instructor
     * @param prereq 
     * 
     * This constructor takes all input
     */
    public Courses(String courseId, String prefix, String courseNum, String section, String startTime, String endTime, String location, String instructor, String prereq) {
        this.courseId = courseId;
        this.prefix = prefix;
        this.courseNum = courseNum;
        this.section = section;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.instructor = instructor;
        this.prereq = prereq;
    }
    
    /**
     * @return the courseId
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * @return the prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix the prefix to set
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @return the courseNum
     */
    public String getCourseNum() {
        return courseNum;
    }

    /**
     * @param courseNum the courseNum to set
     */
    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the instructor
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * @param instructor the instructor to set
     */
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    /**
     * @return the prereq
     */
    public String getPrereq() {
        return prereq;
    }

    /**
     * @param prereq the prereq to set
     */
    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }
}

/**
 * 
 * @author miche
 * 
 * This class creates a Person object with the input given by the user
 */
class Person {
    private String lastName;
    private String firstName;
    private String id;
    private String DOB;
    private String imageFileName;
    private String email;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String homePhone;
    private String workPhone;
    private String cellPhone;
    private String webURL;

    /**
     * 
     * @param lastName
     * @param firstName
     * @param id 
     * 
     * A constructor with only a few entries
     */
    public Person(String lastName, String firstName, String id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    /**
     * 
     * @param lastName
     * @param firstName
     * @param id
     * @param DOB
     * @param imageFileName
     * @param email
     * @param address1
     * @param address2
     * @param city
     * @param state
     * @param zip
     * @param homePhone
     * @param workPhone
     * @param cellPhone
     * @param webURL 
     * 
     * A constructor with all inputs given
     */
    public Person(String lastName, String firstName, String id, String DOB, String imageFileName, String email, String address1, String address2, String city, String state, String zip, String homePhone, String workPhone, String cellPhone, String webURL) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.DOB = DOB;
        this.imageFileName = imageFileName;
        this.email = email;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.cellPhone = cellPhone;
        this.webURL = webURL;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the imageFileName
     */
    public String getImageFileName() {
        return imageFileName;
    }

    /**
     * @param imageFileName the imageFileName to set
     */
    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the homePhone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * @param homePhone the homePhone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @return the workPhone
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * @param workPhone the workPhone to set
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    /**
     * @return the cellPhone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the webURL
     */
    public String getWebURL() {
        return webURL;
    }

    /**
     * @param webURL the webURL to set
     */
    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }
}

/**
 * 
 * @author Michelle Marie Garcia
 * 
 * This class creates Profile objects to hold a complete profile composed of a
 * person's information, their screen name, and their current courses.
 */
class Profile {
    private Person person;
    private String screenName;
    private Courses currentCourses;
    
    @Override
    public String toString() {
        return screenName + "'s Profile:\n" + this.getPerson().getFirstName() + " "
                + this.getPerson().getLastName() + "\n" + this.getPerson().getId() + "\n"
                + this.getPerson().getDOB() + "\n" + this.getPerson().getImageFileName() 
                + "\n" + this.getPerson().getEmail() + "\n" + this.getPerson().getAddress1()
                + "\n" + this.getPerson().getAddress2() + "\n" + this.getPerson().getCity()
                + "\n" + this.getPerson().getState() + "\n" + this.getPerson().getZip()
                + "\n" + this.getPerson().getHomePhone() + "\n" + this.getPerson().getWorkPhone()
                + "\n" + this.getPerson().getCellPhone() + "\n" + this.getPerson().getWebURL()
                + "\n" + this.getCurrentCourses().getCourseId() + "\n" + this.getCurrentCourses().getPrefix() 
                + "\n" + this.getCurrentCourses().getCourseNum() + "\n" + this.getCurrentCourses().getSection()
                + "\n" + this.getCurrentCourses().getStartTime() + "\n" + this.getCurrentCourses().getEndTime()
                + "\n" + this.getCurrentCourses().getLocation() + "\n" + this.getCurrentCourses().getPrereq();
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * @return the screenName
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * @param screenName the screenName to set
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     * @return the currentCourses
     */
    public Courses getCurrentCourses() {
        return currentCourses;
    }

    /**
     * @param currentCourses the currentCourses to set
     */
    public void setCurrentCourses(Courses currentCourses) {
        this.currentCourses = currentCourses;
    }
}