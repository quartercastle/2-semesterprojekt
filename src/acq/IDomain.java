package acq;

public interface IDomain {

  /**
   * Injects datalayer into domain layer
   *
   * @param idb instance of IDatabase
   */
  void injectData(IDatabase idb);
}
