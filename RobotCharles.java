
import java.awt.*;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import acm.graphics.*;
import acm.program.*;

public class RobotCharles extends GraphicsProgram {
	public static final int APPLICATION_WIDTH = 800;
	public static final int APPLICATION_HEIGHT = 800;
	public static final int HEAD_WIDTH = 400;
	public static final int HEAD_HEIGHT = 450;
	public static final int EYE_RADIUS = 80;
	public static final int MOUTH_WIDTH = 300;
	public static final int MOUTH_HEIGHT = 100;

	public void run() {

		int[] canvasCenter = new int[] {APPLICATION_WIDTH /2,APPLICATION_HEIGHT/2};
		generateHead();
		generateMouth(canvasCenter);
		generateEyes(canvasCenter, true);
		generateEyes(canvasCenter, false);
	}

	private void generateHead() {

		GRect rectangle = new GRect(APPLICATION_WIDTH/4, APPLICATION_HEIGHT/4, HEAD_WIDTH, HEAD_HEIGHT);
		rectangle.setFilled(true);
		rectangle.setFillColor(Color.GRAY);
		add(rectangle);
	}

	private void generateEyes(int[] canvasCenter, boolean leftEye) {
		GOval eye = new GOval(0, 0);
		if(leftEye) {
			eye = new GOval(canvasCenter[0]-(MOUTH_WIDTH/2), canvasCenter[1] - (HEAD_HEIGHT/4), EYE_RADIUS, EYE_RADIUS);
		}
		else {
			eye = new GOval(canvasCenter[0]+((MOUTH_WIDTH/2)-EYE_RADIUS), canvasCenter[1] - (HEAD_HEIGHT/4), EYE_RADIUS, EYE_RADIUS);
		}
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		eye.setColor(Color.YELLOW);
		add(eye);
	}

	private void generateMouth(int[] canvasCenter) {
		GRect rectangle = new GRect(canvasCenter[0]-(MOUTH_WIDTH/2), canvasCenter[1] + (HEAD_HEIGHT/4), MOUTH_WIDTH, MOUTH_HEIGHT);
		rectangle.setFilled(true);
		rectangle.setFillColor(Color.WHITE);
		rectangle.setColor(Color.WHITE);
		add(rectangle);
	}
}
