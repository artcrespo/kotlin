// IGNORE_BACKEND: JS_IR
class C() {
  companion object {
    fun create() = C()
  }
}

fun box(): String {
  val c = C.create()
  return if (c is C) "OK" else "fail"
}

