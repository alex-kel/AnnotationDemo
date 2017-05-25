/**
 * Created by kelale on 5/17/2017.
 */
export class AnnotatedCase {
  id: string;
  text: string;
  annotations: Annotation[];
}

export class Annotation {
  id: string;
  type: string;
  typeRu: string;
  offsets: Offset[];
  text: string;
}

export class Offset {
  start: number;
  end: number;
}
