import doodle.core._
import doodle.core.Image._
import doodle.random._
import doodle.syntax._
import doodle.jvm.FileFrame._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._
import doodle.backend.Formats._
import doodle.examples._

object Main extends App {
  ChessBoard.image.draw
}
