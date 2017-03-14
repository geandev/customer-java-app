package customer.manager.domain.model;

import java.util.UUID;

public abstract class ModelBase {
  protected UUID id;

  protected ModelBase() {
    this.id = UUID.randomUUID();
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }
}
