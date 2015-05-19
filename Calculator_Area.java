/**
 * ID: U10316015
 * Ex: _taAssign2_normal
 */
 
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.*;
 import javax.swing.border.*;
 import java.text.DecimalFormat;
 
public  class  Calculator_Area extends JFrame{
	//create three parts which user may see
	private CIRCLE circle = new CIRCLE();
	private SQUARE square = new SQUARE();
	private TRIANGLE triangle = new TRIANGLE();
	
	//Create constructor
	public Calculator_Area(){
		add(circle,BorderLayout.NORTH);
		add(square,BorderLayout.CENTER);
		add(triangle,BorderLayout.SOUTH);
	}
	
	public static void main (String[] args){
		JFrame frame = new Calculator_Area();//create U10316015
		frame.setTitle("U10316015_GeoCalculate");//set title
		frame.pack();//set size
		frame.setLocationRelativeTo(null); // Center the frame
		//terminate when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//set visible
		frame.setResizable(false);//cannot change size
	}
}

class Result extends JPanel{
	//create result JPanel
	JPanel result = new JPanel();
	//create two text field to print result
	JTextField area = new JTextField(8);
	JTextField perimeter = new JTextField(8);
	
	Result(){
		result.setLayout(new GridLayout(2,2));
		//add JLabel and JTextField
		result.add(new JLabel("The area is :"));
		result.add(area);
		result.add(new JLabel("The perimeter is :"));
		result.add(perimeter);
		//add result
		add(result);
	}
}

class CIRCLE extends JPanel{
	//create circle1 JPanel
	JPanel circle1 = new JPanel();
	//create a text field
	JTextField text_radius = new JTextField(4);
	//create 2 JButton
	JButton calculate = new JButton("計算");
	JButton clear = new JButton("清除");
	//create Result
	Result circle_result = new Result();
	
	CIRCLE(){
		circle1.setLayout(new GridLayout(1,4));
		//add JLabel and JButton
		circle1.add(new JLabel("Radius :"));
		circle1.add(text_radius);
		circle1.add(calculate);
		circle1.add(clear);
		
		//add circle1 and circle_result
		add(circle1,BorderLayout.WEST);
		add(circle_result,BorderLayout.EAST);
		
		//set border title
		setBorder(new TitledBorder("Circle"));
		//set cursor
		setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		
		calculate.addActionListener(new ActionListener(){
			@Override//when press calculate, it would calculate result.
			public void actionPerformed(ActionEvent e){
				//set format
				DecimalFormat df=new DecimalFormat("#.##");
				//get result
				double radius = Double.parseDouble(text_radius.getText());
				double answer_area =  radius * radius * Math.PI;
				double answer_perimeter = 2 *  Math.PI * radius;
				//print result
				circle_result.area.setText(df.format(answer_area));
				circle_result.perimeter.setText(df.format(answer_perimeter));
			}
		});
		clear.addActionListener(new ActionListener(){
			@Override//when press clear, it would clear all things.
			public void actionPerformed(ActionEvent e){
				//clear JTextField
				circle_result.area.setText(null);
				circle_result.perimeter.setText(null);
				text_radius.setText(null);
			}
		});
	}
}

class TRIANGLE extends JPanel{
	//create triangle1 JPanel
	JPanel triangle1 = new JPanel();
	//create a text field 
	JTextField text_side = new JTextField(4);
	//create 2 JButton
	JButton calculate = new JButton("計算");
	JButton clear = new JButton("清除");
	//create Result
	Result triangle_result = new Result();
	
	TRIANGLE(){
		triangle1.setLayout(new GridLayout(1,4));
		//add JLabel and JButton
		triangle1.add(new JLabel("Side :"));
		triangle1.add(text_side);
		triangle1.add(calculate);
		triangle1.add(clear);

		//add triangle1 and triangle_result
		add(triangle1,BorderLayout.WEST);
		add(triangle_result,BorderLayout.EAST);
		
		//set border title
		setBorder(new TitledBorder("Regular triangle"));		
		//set cursor
		setCursor(new Cursor(Cursor.MOVE_CURSOR));
		
		calculate.addActionListener(new ActionListener(){
			@Override//when press calculate, it would calculate result.
			public void actionPerformed(ActionEvent e){
				//set format
				DecimalFormat df=new DecimalFormat("#.##");
				//get result
				double side = Double.parseDouble(text_side.getText());
				double answer_area =  side * side  * Math.sqrt(3) / 4;
				double answer_perimeter =  3 * side;
				//print result
				triangle_result.area.setText(df.format(answer_area));
				triangle_result.perimeter.setText(df.format(answer_perimeter));
			}
		});
		clear.addActionListener(new ActionListener(){
			@Override//when press clear, it would clear all things.
			public void actionPerformed(ActionEvent e){
				//clear JTextField
				triangle_result.area.setText(null);
				triangle_result.perimeter.setText(null);
				text_side.setText(null);
			}
		});
	}
}
	
class SQUARE extends JPanel{
	//create square1 JPanel
	JPanel square1 = new JPanel();
	//create a text field
	JTextField text_side = new JTextField(4);
	//create 2 JButton
	JButton calculate = new JButton("計算");
	JButton clear = new JButton("清除");
	//create Result
	Result square_result = new Result();
	
	SQUARE(){
		square1.setLayout(new GridLayout(1,4));
		//add JLabel and JButton
		square1.add(new JLabel("Side :"));
		square1.add(text_side);
		square1.add(calculate);
		square1.add(clear);	

		//add square1 and square_result
		add(square1,BorderLayout.WEST);
		add(square_result,BorderLayout.EAST);
		//set border title
		setBorder(new TitledBorder("Square"));	
		//set cursor
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		calculate.addActionListener(new ActionListener(){
			@Override//when press calculate, it would calculate result.
			public void actionPerformed(ActionEvent e){
				//set format
				DecimalFormat df = new DecimalFormat("#.##");
				//get result
				double side = Double.parseDouble(text_side.getText());
				double answer_area =  side * side ;
				double answer_perimeter = 4 * side;
				//print result
				square_result.area.setText(df.format(answer_area));
				square_result.perimeter.setText(df.format(answer_perimeter));
			}
		});
		clear.addActionListener(new ActionListener(){
			@Override//when press clear, it would clear all things.
			public void actionPerformed(ActionEvent e){
				//clear JTextField
				square_result.area.setText(null);
				square_result.perimeter.setText(null);
				text_side.setText(null);
			}
		});
	}
}
