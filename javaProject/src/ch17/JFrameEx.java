package ch17;

import javax.swing.JFrame;

public class JFrameEx extends JFrame {
	public JFrameEx() {
		super("JFrame 예제");
			setSize(400, 300);
			setVisible(true);
}

	public static void main(String[] args) {
		new JFrameEx();

	}

}
