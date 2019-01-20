package de.wolff.paa.transform;

import java.io.DataInput;
import java.io.IOException;

class ClassMethodsPart extends AbstractClassListPart<ClassMemberEntry> {

  ClassMethodsPart(DataInput source) throws IOException {
    super(source);
  }

  @Override
  protected ClassMemberEntry readPartEntry(DataInput source) throws IOException {
    return new ClassMemberEntry(source);
  }

}