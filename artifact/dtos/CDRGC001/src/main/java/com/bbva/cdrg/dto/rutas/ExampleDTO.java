package com.bbva.cdrg.dto.rutas;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.bbva.apx.dto.AbstractDTO;
/**
 * Clase Ejemplo para desarrollo de un DTO fuera del modelo canonico
 * @author beeva
 *
 */
public class ExampleDTO extends AbstractDTO {
    private static final long serialVersionUID = 2931699728946643245L;
    private String name;
    private String surname;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj.getClass() != getClass()) {
          return false;
        }
        final ExampleDTO rhs = (ExampleDTO) obj;
        return new EqualsBuilder()
                      .appendSuper(super.equals(obj))
                      .append(name, rhs.name)
                      .append(surname, rhs.surname)
                      .isEquals();
    }
    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override  
    public int hashCode()  
    {  
       return new HashCodeBuilder()  
          .append(this.name)  
          .append(this.surname)  
          .toHashCode();  
    }
    /*
     * Es importante OFUSCAR los campos que sean sensibles a mostrar en la representacion
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this)
        .append("name", name)
        .append("surname", surname)
        .toString();  
    }
}
