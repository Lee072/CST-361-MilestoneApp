package business;

import java.util.List;

import beans.Sensor;
import beans.UserModel;

public interface SensorManagerInterface {
	Sensor addSensor(Sensor sensor);
	List<Sensor> getSensor(UserModel um);
	Sensor findSensor(Sensor sensor);
}
