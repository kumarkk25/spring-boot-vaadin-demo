package demo.vaadin;

import org.vaadin.spring.VaadinUI;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.UI;

@VaadinUI(path = "/simple")
public class SimpleVaadinUI extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest vaadinRequest) {

		Label label = new Label("Hello! I'm another simple UI!");
		Link linkToSpring = new Link("Back to spring's thymleave",
				new ExternalResource("/"));

		AbsoluteLayout absoluteLayout = new AbsoluteLayout();
		absoluteLayout.addStyleName("outlined");
		absoluteLayout.setSizeFull();

		absoluteLayout.addComponent(label, "top:10px; left:10px");
		absoluteLayout.addComponent(linkToSpring, "top: 100px; left: 50px");

		setContent(absoluteLayout);
	}
}