package clock;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: priprave11
 * Date: 10.7.12
 * Time: 11:33
 * To change this template use File | Settings | File Templates.
 */
@ApplicationScoped
@Named
public class ClockController {
    private ClockModel model = new ClockModel();

    public ClockModel getModel() {
        return model;
    }
    public void inc(){
        System.out.println("kličemo metodo");
        model.setMinutes(model.getMinutes()+1);
    }
}

