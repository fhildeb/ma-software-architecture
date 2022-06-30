package observer.pattern;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;

public class ObservableSlider extends Observable 
{
	public ObservableSlider(Slider sl)
	{
		sl.valueProperty().addListener(this::onSliderChange);
	}
	
	private void onSliderChange(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
	{
		fireUpdate(newValue.doubleValue());
	}
	

}
