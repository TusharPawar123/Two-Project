package datatypes;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(10,"Dogs","Animals");
		dataset.addValue(42,"Cats","Animals");
		dataset.addValue(25,"Lizards","Animals");
		
		JFreeChart barChart = ChartFactory.createBarChart(
				"Animals Chart",
				"X Lable",
				"Y Lable",
				dataset,
				PlotOrientation.VERTICAL,
				true,true,false);
		
		ChartPanel chartPanel(barChart);
		
		JFrame = new JFrame("Chart Example");
		frame.SetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(chartPanel);
		frame.setSize(500,500);
		frame.setVisible(true);
		
				
				
				
			
				
	}

}
