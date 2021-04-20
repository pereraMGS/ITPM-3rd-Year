package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class AddSubjectController {

	@FXML
    private Text dashBoard;

    @FXML
    private Text addLec;

    @FXML
    private Text manageLec;

    @FXML
    private Text addSub;

    @FXML
    private Text manageSub;

    @FXML
    private Text daysAndHrs;

    @FXML
    private Text addStdnGrp;

    @FXML
    private Text manageStdnGrp;

    @FXML
    private Text addTags;

    @FXML
    private Text manageTags;

    @FXML
    private Text addLocation;

    @FXML
    private Text manageLocation;

    @FXML
    private Text addSession;

    @FXML
    private Text manageSession;

    @FXML
    private Text addSubTopic;

    @FXML
    private Label offeredYearL;

    @FXML
    private ComboBox<?> selelectOfferedYear;

    @FXML
    private Label offeredSemL;

    @FXML
    private RadioButton semOne;

    @FXML
    private RadioButton semTwo;

    @FXML
    private Label subNameL;

    @FXML
    private TextField inputSubName;

    @FXML
    private Label subCodeL;

    @FXML
    private TextField inputSubCode;

    @FXML
    private Label lecHrsL;

    @FXML
    private TextField inputLecHrs;

    @FXML
    private Label tuteHrsL;

    @FXML
    private TextField inputTuteHrs;

    @FXML
    private Label labHrsL;

    @FXML
    private TextField inputLabHrs;

    @FXML
    private Label evaluHrsL;

    @FXML
    private TextField inputevaluationHrs;

    @FXML
    private Button clearbtn;

    @FXML
    private Button savebtn;

    @FXML
    private HBox headerBar;

    @FXML
    private ImageView companyLogo;

    @FXML
    private Button searchBtn;

    @FXML
    private TextField seachBox;

    @FXML
    void btnSearch(ActionEvent event) {

    }

    @FXML
    void clearBtn(ActionEvent event) {

    }

    @FXML
    void saveBtn(ActionEvent event) {

    }

}
