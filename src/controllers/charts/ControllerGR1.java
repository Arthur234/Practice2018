package controllers.charts;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import usage.Lab5;

public class ControllerGR1 {

    @FXML
    private LineChart<?, ?> chart;

    @FXML
    private CategoryAxis nAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    void initialize() {
        XYChart.Series series = new XYChart.Series();
        double i = -3.1;
        while (i < 3.1) {
            series.getData().add(new XYChart.Data<String, Number>(String.format("%2f", Lab5.f1(i)), i));
            i = i + 0.1;
        }
        chart.getData().addAll(series);
    }
}
