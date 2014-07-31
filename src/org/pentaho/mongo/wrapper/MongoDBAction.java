package org.pentaho.mongo.wrapper;

import org.pentaho.mongo.MongoDbException;

import com.mongodb.DB;

public interface MongoDBAction<ReturnType> {
  public ReturnType perform( DB db ) throws MongoDbException;
}
