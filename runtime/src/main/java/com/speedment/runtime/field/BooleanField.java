package com.speedment.runtime.field;

import com.speedment.runtime.annotation.Api;
import com.speedment.runtime.field.trait.HasBooleanValue;

/**
 * A field that represents a primitive {@code boolean} value.
 * 
 * @param <ENTITY> entity type
 * @param <D>      database type
 * 
 * @author Emil Forslund
 * @since  3.0.0
 * 
 * @see ReferenceField
 */
@Api(version = "3.0")
public interface BooleanField<ENTITY, D> extends Field<ENTITY>, HasBooleanValue<ENTITY, D> {
    
    
}