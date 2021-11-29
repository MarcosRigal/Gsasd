/**
 * CalculatorServiceCallbackHandler.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:19 HST)
 */
package service;

/**
 * CalculatorServiceCallbackHandler Callback class, Users can extend this class and implement their
 * own receiveResult and receiveError methods.
 */
public abstract class CalculatorServiceCallbackHandler {

  protected Object clientData;

  /**
   * User can pass in any object that needs to be accessed once the NonBlocking Web service call is
   * finished and appropriate method of this CallBack is called.
   *
   * @param clientData Object mechanism by which the user can pass in user data that will be
   *     avilable at the time this callback is called.
   */
  public CalculatorServiceCallbackHandler(Object clientData) {
    this.clientData = clientData;
  }

  /** Please use this constructor if you don't want to set any clientData */
  public CalculatorServiceCallbackHandler() {
    this.clientData = null;
  }

  /** Get the client data */
  public Object getClientData() {
    return clientData;
  }

  /**
   * auto generated Axis2 call back method for suma method override this method for handling normal
   * response from suma operation
   */
  public void receiveResultsuma(service.CalculatorServiceStub.SumaResponse result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from suma
   * operation
   */
  public void receiveErrorsuma(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for division method override this method for handling
   * normal response from division operation
   */
  public void receiveResultdivision(service.CalculatorServiceStub.DivisionResponse result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * division operation
   */
  public void receiveErrordivision(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for multiplicacion method override this method for
   * handling normal response from multiplicacion operation
   */
  public void receiveResultmultiplicacion(
      service.CalculatorServiceStub.MultiplicacionResponse result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * multiplicacion operation
   */
  public void receiveErrormultiplicacion(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for resta method override this method for handling normal
   * response from resta operation
   */
  public void receiveResultresta(service.CalculatorServiceStub.RestaResponse result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from resta
   * operation
   */
  public void receiveErrorresta(java.lang.Exception e) {}
}
