package fr.sorbonne_u.alasca.heating;

import fr.sorbonne_u.components.connectors.AbstractConnector;

public class HeatingConnector extends AbstractConnector implements HeatingControlCI {

	@Override
	public boolean getState() throws Exception {
		return ((HeatingControlCI)this.offering).getState();
	}

	@Override
	public void scheduleOn() throws Exception {
		((HeatingControlCI)this.offering).scheduleOn();

	}

	@Override
	public void scheduleOff() throws Exception {
		((HeatingControlCI)this.offering).scheduleOff();

	}

	@Override
	public void resume() throws Exception {
		((HeatingControlCI)this.offering).resume();

	}

	@Override
	public void setTemp1(double temp) throws Exception {
		((HeatingControlCI)this.offering).setTemp1(temp);

	}

	@Override
	public void setTemp2(double temp) throws Exception {
		((HeatingControlCI)this.offering).setTemp2(temp);

	}

	@Override
	public void setTimeBand1(int deb, int fin) throws Exception {
		((HeatingControlCI)this.offering).setTimeBand1(deb, fin);

	}

	@Override
	public void setTimeBand2(int deb, int fin) throws Exception {
		((HeatingControlCI)this.offering).setTimeBand2(deb, fin);

	}

}
