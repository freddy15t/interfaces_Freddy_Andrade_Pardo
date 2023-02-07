package GraficoCircular;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class ControladorCircular {

	@FXML
	private PieChart GraficoCircular;

	@FXML
	private void initialize() {
		// Rellenamos los datos del gr�fico
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data(" Clasico", 20), new PieChart.Data(" Militar", 30),
				new PieChart.Data(" Pompadour", 20), new PieChart.Data(" Fade", 25), new PieChart.Data(" Taper", 35));

		GraficoCircular.setData(pieChartData);

	}

}
