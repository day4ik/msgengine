package models

import java.util.UUID

case class Player(id: Option[Player.ID], roomId: Room.ID, role: String/*should be adt*/)

object Player {
  type ID = UUID
}
