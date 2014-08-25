package demo.vaadin;

import org.vaadin.spring.VaadinUI;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@VaadinUI(path="rwe")
public class MyVaadinRweUI extends UI {

	private static final long serialVersionUID = 1L;

	@Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello! I'm the rwe UI!"));
    }
}