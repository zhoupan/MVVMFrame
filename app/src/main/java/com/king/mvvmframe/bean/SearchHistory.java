package com.king.mvvmframe.bean;


import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Entity(indices = {@Index(value = "name", unique = true)})
public class SearchHistory {

 @PrimaryKey(autoGenerate = true)
 private long id;

 private String name;

 private long time;

 public SearchHistory(String name) {
  this.name = name;
  time = System.currentTimeMillis();
 }

 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public long getTime() {
  return time;
 }

 public void setTime(long time) {
  this.time = time;
 }

 @Override
 public String toString() {
  return "SearchHistory{" +
   "id=" + id +
   ", name='" + name + '\'' +
   ", time=" + time +
   '}';
 }
}
