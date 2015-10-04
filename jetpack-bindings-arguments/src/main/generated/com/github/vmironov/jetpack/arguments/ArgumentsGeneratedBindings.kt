// Code generated by ./jetpack-bindings-arguments/generate.sh
package com.github.vmironov.jetpack.arguments

import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable
import java.util.ArrayList
import kotlin.properties.ReadWriteProperty

public fun Any.bindBooleanArgument(name: String? = null, default: Boolean? = null): ReadWriteProperty<Any, Boolean> = ArgumentsVar(this, name, default, GETTER_BOOLEAN, SETTER_BOOLEAN)
public fun Any.bindDoubleArgument(name: String? = null, default: Double? = null): ReadWriteProperty<Any, Double> = ArgumentsVar(this, name, default, GETTER_DOUBLE, SETTER_DOUBLE)
public fun Any.bindIntArgument(name: String? = null, default: Int? = null): ReadWriteProperty<Any, Int> = ArgumentsVar(this, name, default, GETTER_INT, SETTER_INT)
public fun Any.bindLongArgument(name: String? = null, default: Long? = null): ReadWriteProperty<Any, Long> = ArgumentsVar(this, name, default, GETTER_LONG, SETTER_LONG)
public fun Any.bindStringArgument(name: String? = null, default: String? = null): ReadWriteProperty<Any, String> = ArgumentsVar(this, name, default, GETTER_STRING, SETTER_STRING)
public fun Any.bindCharSequenceArgument(name: String? = null, default: CharSequence? = null): ReadWriteProperty<Any, CharSequence> = ArgumentsVar(this, name, default, GETTER_CHARSEQUENCE, SETTER_CHARSEQUENCE)
public fun Any.bindFloatArgument(name: String? = null, default: Float? = null): ReadWriteProperty<Any, Float> = ArgumentsVar(this, name, default, GETTER_FLOAT, SETTER_FLOAT)
public fun Any.bindParcelableArgument(name: String? = null, default: Parcelable? = null): ReadWriteProperty<Any, Parcelable> = ArgumentsVar(this, name, default, GETTER_PARCELABLE, SETTER_PARCELABLE)
public fun Any.bindSerializableArgument(name: String? = null, default: Serializable? = null): ReadWriteProperty<Any, Serializable> = ArgumentsVar(this, name, default, GETTER_SERIALIZABLE, SETTER_SERIALIZABLE)
public fun Any.bindStringArrayListArgument(name: String? = null, default: ArrayList<String>? = null): ReadWriteProperty<Any, ArrayList<String>> = ArgumentsVar(this, name, default, GETTER_STRINGARRAYLIST, SETTER_STRINGARRAYLIST)
public fun Any.bindIntegerArrayListArgument(name: String? = null, default: ArrayList<Int>? = null): ReadWriteProperty<Any, ArrayList<Int>> = ArgumentsVar(this, name, default, GETTER_INTEGERARRAYLIST, SETTER_INTEGERARRAYLIST)
public fun Any.bindParcelableArrayListArgument(name: String? = null, default: ArrayList<Parcelable>? = null): ReadWriteProperty<Any, ArrayList<Parcelable>> = ArgumentsVar(this, name, default, GETTER_PARCELABLEARRAYLIST, SETTER_PARCELABLEARRAYLIST)

public fun Any.bindOptionalBooleanArgument(name: String? = null, default: Boolean? = null): ReadWriteProperty<Any, Boolean?> = OptionalArgumentsVar(this, name, default, GETTER_BOOLEAN, SETTER_BOOLEAN)
public fun Any.bindOptionalDoubleArgument(name: String? = null, default: Double? = null): ReadWriteProperty<Any, Double?> = OptionalArgumentsVar(this, name, default, GETTER_DOUBLE, SETTER_DOUBLE)
public fun Any.bindOptionalIntArgument(name: String? = null, default: Int? = null): ReadWriteProperty<Any, Int?> = OptionalArgumentsVar(this, name, default, GETTER_INT, SETTER_INT)
public fun Any.bindOptionalLongArgument(name: String? = null, default: Long? = null): ReadWriteProperty<Any, Long?> = OptionalArgumentsVar(this, name, default, GETTER_LONG, SETTER_LONG)
public fun Any.bindOptionalStringArgument(name: String? = null, default: String? = null): ReadWriteProperty<Any, String?> = OptionalArgumentsVar(this, name, default, GETTER_STRING, SETTER_STRING)
public fun Any.bindOptionalCharSequenceArgument(name: String? = null, default: CharSequence? = null): ReadWriteProperty<Any, CharSequence?> = OptionalArgumentsVar(this, name, default, GETTER_CHARSEQUENCE, SETTER_CHARSEQUENCE)
public fun Any.bindOptionalFloatArgument(name: String? = null, default: Float? = null): ReadWriteProperty<Any, Float?> = OptionalArgumentsVar(this, name, default, GETTER_FLOAT, SETTER_FLOAT)
public fun Any.bindOptionalParcelableArgument(name: String? = null, default: Parcelable? = null): ReadWriteProperty<Any, Parcelable?> = OptionalArgumentsVar(this, name, default, GETTER_PARCELABLE, SETTER_PARCELABLE)
public fun Any.bindOptionalSerializableArgument(name: String? = null, default: Serializable? = null): ReadWriteProperty<Any, Serializable?> = OptionalArgumentsVar(this, name, default, GETTER_SERIALIZABLE, SETTER_SERIALIZABLE)
public fun Any.bindOptionalStringArrayListArgument(name: String? = null, default: ArrayList<String>? = null): ReadWriteProperty<Any, ArrayList<String>?> = OptionalArgumentsVar(this, name, default, GETTER_STRINGARRAYLIST, SETTER_STRINGARRAYLIST)
public fun Any.bindOptionalIntegerArrayListArgument(name: String? = null, default: ArrayList<Int>? = null): ReadWriteProperty<Any, ArrayList<Int>?> = OptionalArgumentsVar(this, name, default, GETTER_INTEGERARRAYLIST, SETTER_INTEGERARRAYLIST)
public fun Any.bindOptionalParcelableArrayListArgument(name: String? = null, default: ArrayList<Parcelable>? = null): ReadWriteProperty<Any, ArrayList<Parcelable>?> = OptionalArgumentsVar(this, name, default, GETTER_PARCELABLEARRAYLIST, SETTER_PARCELABLEARRAYLIST)

private val GETTER_BOOLEAN: (String, Bundle) -> Boolean? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getBoolean(name)
  } else {
    null
  }
}

private val GETTER_DOUBLE: (String, Bundle) -> Double? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getDouble(name)
  } else {
    null
  }
}

private val GETTER_INT: (String, Bundle) -> Int? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getInt(name)
  } else {
    null
  }
}

private val GETTER_LONG: (String, Bundle) -> Long? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getLong(name)
  } else {
    null
  }
}

private val GETTER_STRING: (String, Bundle) -> String? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getString(name)
  } else {
    null
  }
}

private val GETTER_CHARSEQUENCE: (String, Bundle) -> CharSequence? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getCharSequence(name)
  } else {
    null
  }
}

private val GETTER_FLOAT: (String, Bundle) -> Float? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getFloat(name)
  } else {
    null
  }
}

private val GETTER_PARCELABLE: (String, Bundle) -> Parcelable? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getParcelable(name)
  } else {
    null
  }
}

private val GETTER_SERIALIZABLE: (String, Bundle) -> Serializable? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getSerializable(name)
  } else {
    null
  }
}

private val GETTER_STRINGARRAYLIST: (String, Bundle) -> ArrayList<String>? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getStringArrayList(name)
  } else {
    null
  }
}

private val GETTER_INTEGERARRAYLIST: (String, Bundle) -> ArrayList<Int>? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getIntegerArrayList(name)
  } else {
    null
  }
}

private val GETTER_PARCELABLEARRAYLIST: (String, Bundle) -> ArrayList<Parcelable>? = { name, bundle ->
  if (bundle.containsKey(name)) {
    bundle.getParcelableArrayList(name)
  } else {
    null
  }
}

private val SETTER_BOOLEAN: (String, Bundle, Boolean?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putBoolean(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_DOUBLE: (String, Bundle, Double?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putDouble(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_INT: (String, Bundle, Int?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putInt(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_LONG: (String, Bundle, Long?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putLong(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_STRING: (String, Bundle, String?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putString(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_CHARSEQUENCE: (String, Bundle, CharSequence?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putCharSequence(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_FLOAT: (String, Bundle, Float?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putFloat(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_PARCELABLE: (String, Bundle, Parcelable?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putParcelable(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_SERIALIZABLE: (String, Bundle, Serializable?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putSerializable(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_STRINGARRAYLIST: (String, Bundle, ArrayList<String>?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putStringArrayList(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_INTEGERARRAYLIST: (String, Bundle, ArrayList<Int>?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putIntegerArrayList(name, value)
  } else {
    bundle.remove(name)
  }
}

private val SETTER_PARCELABLEARRAYLIST: (String, Bundle, ArrayList<Parcelable>?) -> Unit = { name, bundle, value ->
  if (value != null) {
    bundle.putParcelableArrayList(name, value)
  } else {
    bundle.remove(name)
  }
}

