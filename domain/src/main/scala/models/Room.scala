package models

import java.time.{ Duration => JDuration }
import java.util.UUID

/*
* Room will also contains some info about type and dsl logic in future*/
case class Room(id: Option[Room.ID], applicationId: Application.ID, liveTime: JDuration)

object Room {
  type ID = UUID
}
