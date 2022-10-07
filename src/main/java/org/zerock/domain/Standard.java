package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
public class Standard {

  private int pageNum;
  private int amount;
  
	/*
	 * private String type; private String keyword;
	 */

  public Standard() {
    this(1, 10);
  }

  public Standard(int pageNum, int amount) {
    this.pageNum = pageNum;
    this.amount = amount;
  }
  

}
