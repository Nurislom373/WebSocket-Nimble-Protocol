package org.khasanof.model.method;

import lombok.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author Nurislom
 * @see org.khasanof.model.method
 * @since 6/9/2024 6:46 AM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WsProtocolMethod {

    private Method method;
    private Object instance;
    private String methodName;
    private Annotation annotation;
}
