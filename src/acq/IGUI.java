package acq;

public interface IGUI {

  /**
   * Injects Domain layer into GUI layer
   *
   * @param id instance of IDomain
   *
   */
  void injectDomain(IDomain id);
}
