package com.apptware.interview.spring.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
class OnDemandB extends BaseOnDemand {

  OnDemandB(String someString) {
    super(someString);
  }

  @Override
  public SomeEnum getSomeEnum() {
    return SomeEnum.SOME_ENUM_B;
  }
}
