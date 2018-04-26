package models

import java.time.LocalDateTime


case class Application(
                        id: Option[Application.ID],
                        name: String,
                        publisherId: Publisher.ID,
                        registeredAt: LocalDateTime,
                        description: Option[String],
                        isDeleted: Boolean
                      )

object Application {
  type ID = Int
}
