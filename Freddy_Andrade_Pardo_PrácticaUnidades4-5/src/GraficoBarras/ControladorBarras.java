package GraficoBarras;

import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;

public class ControladorBarras {

	@FXML
	private BarChart<String, Double> graficoBarras;

	@FXML
	private CategoryAxis barraEjex;

	@FXML
	private StackedBarChart<String, Double> graficoBarrasApilado;

	@FXML
	private CategoryAxis ejeXApilado;

	// Lista con los pa�ses que se mostrar�n en el eje X de ambos gr�ficos
	private ObservableList<String> nombrePaises = FXCollections.observableArrayList();

	@FXML
	private void initialize() {
		// Se inicializa el listado de pa�ses que se a�adir�n en el eje X de cada
		// gr�fico
		String[] paises = new String[] { "Espa�a", "Marruecos", "Alemania", "Holanda" };
		nombrePaises = FXCollections.observableArrayList();
		nombrePaises.addAll(Arrays.asList(paises));

		// BarChart est�ndar
		// Se asignan los valores posibles del eje X
		barraEjex.setCategories(nombrePaises);

		// Se a�aden las series al gr�fico de tipo BarChart
		graficoBarras.getData().add(inicializarDatos1());

		graficoBarras.getData().add(inicializarDatos2());

		graficoBarras.getData().add(inicializarDatos3());

		// StackedBarChart est�ndar
		// Se asignan los valores posibles del eje X
		ejeXApilado.setCategories(nombrePaises);

		// Se a�aden las series al gr�fico de tipo StackedBarChart
		graficoBarrasApilado.getData().add(inicializarDatos1());
		graficoBarrasApilado.getData().add(inicializarDatos2());
		graficoBarrasApilado.getData().add(inicializarDatos3());
	}

	// M�todos que se encarga de inicializar las series con datos para los gr�ficos
	private XYChart.Series<String, Double> inicializarDatos1() {
		XYChart.Series<String, Double> series1 = new XYChart.Series<String, Double>();

		series1.setName("2020");
		series1.getData().add(new XYChart.Data<String, Double>("Espa�a", 32540.65));
		series1.getData().add(new XYChart.Data<String, Double>("Marruecos", 65784.68));
		series1.getData().add(new XYChart.Data<String, Double>("Alemania", 57454.12));
		series1.getData().add(new XYChart.Data<String, Double>("Holanda", 78956.14));
		return series1;
	}

	private XYChart.Series<String, Double> inicializarDatos2() {
		XYChart.Series<String, Double> series2 = new XYChart.Series<String, Double>();

		series2.setName("2021");
		series2.getData().add(new XYChart.Data<String, Double>("Espa�a", 40235.58));
		series2.getData().add(new XYChart.Data<String, Double>("Marruecos", 71242.35));
		series2.getData().add(new XYChart.Data<String, Double>("Alemania", 62457.69));
		series2.getData().add(new XYChart.Data<String, Double>("Holanda", 85052.16));

		return series2;
	}

	private XYChart.Series<String, Double> inicializarDatos3() {
		XYChart.Series<String, Double> series3 = new XYChart.Series<String, Double>();

		series3.setName("2022");
		series3.getData().add(new XYChart.Data<String, Double>("Espa�a", 37514.15));
		series3.getData().add(new XYChart.Data<String, Double>("Marruecos", 68785.68));
		series3.getData().add(new XYChart.Data<String, Double>("Alemania", 59278.71));
		series3.getData().add(new XYChart.Data<String, Double>("Holanda", 83257.23));

		return series3;
	}

}
