package com.teknoserval.phrasematch.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dreams")
public class Song {
  
  @Id
  @GeneratedValue
  private Long id;

  private String title;

  @OneToMany(mappedBy = "song")
  private Set<Phrase> phrases = new HashSet<>();

  public Long getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public Set<Phrase> getPhrases() {
    return this.phrases;
  }
}
