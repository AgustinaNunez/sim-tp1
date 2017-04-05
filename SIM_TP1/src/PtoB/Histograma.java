package PtoB;

import java.io.IOException;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.ui.ApplicationFrame;

public class Histograma extends ApplicationFrame {
    static double vec[];
    static int b;

    public Histograma(String title, double vec[], int b) {
        super(title);
        this.vec = vec;
        this.b = b;
        for (int i = 0; i < vec.length; i++) {

        }
        JPanel chartPanel = crearPanel();
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
        setContentPane(chartPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private static IntervalXYDataset crearDataset() {
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("metodoMixto", vec, b, 0.0001, 0.9999);
        return dataset;
    }

    private static JFreeChart crearChart(IntervalXYDataset dataset) {
        JFreeChart chart = ChartFactory.createHistogram(
                "Histograma",
                "Intervalos",
                "Frecuencia Observada",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        XYPlot plot = (XYPlot) chart.getPlot();
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        return chart;
    }

    public static JPanel crearPanel() {
        JFreeChart chart = crearChart(crearDataset());
        return new ChartPanel(chart);
    }

    public static void main(String[] args) throws IOException {

    }
}