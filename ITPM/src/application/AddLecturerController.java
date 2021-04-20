package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class AddLecturerController {
	
	@FXML
    private HBox headerBar;

    @FXML
    private ImageView companyLogo;

    @FXML
    private TextField seachBox;
    
    @FXML
    private Button searchBtn;

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
    private Label lecNameTF;

    @FXML
    private TextField inputLecName;

    @FXML
    private Label empIdTF;

    @FXML
    private TextField inputEmpID;

    @FXML
    private Label facultyTF;

    @FXML
    private ComboBox<?> selectFaculty;

    @FXML
    private Label deptTF;

    @FXML
    private ComboBox<?> selectDept;

    @FXML
    private Label centerTF;

    @FXML
    private ComboBox<?> selectCenter;

    @FXML
    private Label buildingTF;

    @FXML
    private ComboBox<?> selectBuilding;

    @FXML
    private Label levelTF;

    @FXML
    private ComboBox<?> selectLevel;

    @FXML
    private Label lecHrsTF;

    @FXML
    private Label rankTF;

    @FXML
    private TextField inputRank;

    @FXML
    private Button generateRankbtn;

    @FXML
    private Button clearbtn;

    @FXML
    private Button savebtn;

    @FXML
    void clearBtn(ActionEvent event) {

    }

    @FXML
    void genRankBtn(ActionEvent event) {

    }

    @FXML
    void saveBtn(ActionEvent event) {

    }
    
    @FXML
    void btnSearch(ActionEvent event) {

    }
    
}
