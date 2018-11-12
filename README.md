[![Build Status](https://travis-ci.com/mtumilowicz/exceptions-localizedMessage-vs-message.svg?branch=master)](https://travis-ci.com/mtumilowicz/exceptions-localizedMessage-vs-message)

# exceptions-localizedMessage-vs-message
Example of exceptions: localizedMessage vs message.

# preface
From `Throwable`:
> Creates a localized description of this throwable.
Subclasses may override this method in order to produce a
locale-specific message.  For subclasses that do not override this
method, the default implementation returns the same result as
`getMessage()`.
```
public String getLocalizedMessage() {
    return getMessage();
}
```

# project description
We provide `CustomException` with overriden method:
```
@Override
public String getLocalizedMessage() {
    return labels.getString(getMessage());
}
```
where: 
```
ResourceBundle labels = ResourceBundle.getBundle("exceptions");
```

and three `.properties` classes:
* `exceptions.properties`
* `exceptions_en_US.properties`
* `exceptions_fr_FR.properties`

# tests
In `ExceptionMessageTest` we provided tests for:
* `getMessage()`
* `getLocalizedMessage()` with `Locale.FR`
* `getLocalizedMessage()` with `Locale.EN`