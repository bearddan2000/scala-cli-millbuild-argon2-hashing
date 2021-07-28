import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object CLI extends ScalaModule {
    def scalaVersion = "2.13.1"

    def ivyDeps = Agg(
      ivy"de.mkammerer:argon2-jvm:2.5",
      ivy"com.outr::profig:2.3.6"
    )
}
