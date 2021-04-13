package com.teknoserval.phrasematch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phrases")
public class Phrase {

  @Id
  @GeneratedValue
  private Long id;

  private String contents;

  private int syllables;

  public Long getId() {
    return this.id;
  }

  public String getContents() {
    return this.contents;
  }

  public int getSyllables() {
    return this.syllables;
  }
  
}
