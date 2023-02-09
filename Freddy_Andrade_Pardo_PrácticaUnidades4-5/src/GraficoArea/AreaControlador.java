package GraficoArea;

import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
/**
 * 
 * @author Freddy Andrade Pardo
  * @version 1.0

 */
public class AreaControlador {

	@FXML
	private AreaChart<String, Integer> graficoArea;

	@FXML
	private StackedAreaChart<Integer, Integer> graficoAreaApilada;

	// @FXML
	private CategoryAxis xAxisArea;

	@FXML
	private void initialize() {
		iniciarAreaChart();
		iniciarStackedAreaChart();
	}

	private void iniciarAreaChart() {
		// Para los AreaChart, SceneBuilder obliga a emplear un CategoryAxis cuyos
		// valores deben ser String
		// aunque sean numeros. Es posible indicar las categorias con el m�todo
		// setCategories de xAxis
		// pero si no se indica se crea automaticamente segun los datos de las series

		// Se crean dos series con datos de grafico area

		XYChart.Series<String, Integer> seriesApril = new XYChart.Series<String, Integer>();
		seriesApril.setName("ABRIL");
		seriesApril.getData().add(new XYChart.Data<String, Integer>("1", 4));
		seriesApril.getData().add(new XYChart.Data<String, Integer>("3", 8));
		seriesApril.getData().add(new XYChart.Data<String, Integer>("5", 10));
		seriesApril.getData().add(new XYChart.Data<String, Integer>("9", 13));

		XYChart.Series<String, Integer> seriesMay = new XYChart.Series<String, Integer>();
		seriesMay.setName("MAYO");
		seriesMay.getData().add(new XYChart.Data<String, Integer>("1", 18));
		seriesMay.getData().add(new XYChart.Data<String, Integer>("3", 14));
		seriesMay.getData().add(new XYChart.Data<String, Integer>("5", 10));
		seriesMay.getData().add(new XYChart.Data<String, Integer>("9", 7));

		// Se anaden las series al grafico de tipo AreaChart
		graficoArea.getData().add(seriesApril);
		graficoArea.getData().add(seriesMay);
	}

	
	private void iniciarStackedAreaChart() {
		// Para los StackedAreaChart, SceneBuilder obliga a emplear dos NumberAxis cuyos
		// valores deben
		// ser Number o tipos que heredan de este

		// Se crean dos series con datos
		XYChart.Series<Integer, Integer> seriesApril = new XYChart.Series<Integer, Integer>();
		seriesApril.setName("ABRIL");
		seriesApril.getData().add(new XYChart.Data<Integer, Integer>(1, 4));
		seriesApril.getData().add(new XYChart.Data<Integer, Integer>(3, 10));
		seriesApril.getData().add(new XYChart.Data<Integer, Integer>(5, 15));
		seriesApril.getData().add(new XYChart.Data<Integer, Integer>(9, 7));

		XYChart.Series<Integer, Integer> seriesMay = new XYChart.Series<Integer, Integer>();
		seriesMay.setName("ABRIL");
		seriesMay.getData().add(new XYChart.Data<Integer, Integer>(1, 17));
		seriesMay.getData().add(new XYChart.Data<Integer, Integer>(3, 15));
		seriesMay.getData().add(new XYChart.Data<Integer, Integer>(5, 13));
		seriesMay.getData().add(new XYChart.Data<Integer, Integer>(8, 10));

		// Se anaden las series al grafico de tipo AreaChart
		graficoAreaApilada.getData().add(seriesApril);
		graficoAreaApilada.getData().add(seriesMay);
	}

}
