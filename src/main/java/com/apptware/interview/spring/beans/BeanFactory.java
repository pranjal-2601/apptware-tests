package com.apptware.interview.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BeanFactory {

  @Autowired private ApplicationContext context;

  public OnDemand getOnDemandBean(SomeEnum someEnum, String someString) {
    return context.getBean(resolve(someEnum), someString);
  }

  public Class<? extends BaseOnDemand> resolve(SomeEnum someEnum) {
       return switch (someEnum) {
          case SOME_ENUM_A -> OnDemandA.class;
          case SOME_ENUM_B -> OnDemandB.class;
      };
  }
}
