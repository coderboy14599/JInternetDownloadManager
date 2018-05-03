import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;


class ProgressRenderer extends JProgressBar implements TableCellRenderer {
	/**
	 * This class renders a JProgressBar in a table cell.
	 */
	private static final long serialVersionUID = -4406475739827524741L;

	// Constructor for ProgressRenderer.
	public ProgressRenderer(int min, int max) {
		super(min, max);
	}

	/* Returns this JProgressBar as the renderer for the given table cell. */
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		// Set JProgressBar's percent complete value.
		setValue((int) ((Float) value).floatValue());
		return this;
	}
}