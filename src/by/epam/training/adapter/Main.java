package by.epam.training.adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
	}

}
