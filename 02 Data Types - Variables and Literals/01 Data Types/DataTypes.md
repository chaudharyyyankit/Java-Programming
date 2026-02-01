# Java Data Types

## Overview
Java data types are divided into two categories: **Primitive** and **Non-Primitive** (Reference) types.

---

## Primitive Data Types

Primitive types are predefined and store simple values in stack memory.

| Type | Size | Range | Default Value |
|------|------|-------|----------------|
| `byte` | 1 byte | -128 to 127 | 0 |
| `short` | 2 bytes | -32,768 to 32,767 | 0 |
| `int` | 4 bytes | -2³¹ to 2³¹-1 | 0 |
| `long` | 8 bytes | -2⁶³ to 2⁶³-1 | 0L |
| `float` | 4 bytes | ~±3.4 × 10³⁸ | 0.0f |
| `double` | 8 bytes | ~±1.7 × 10³⁰⁸ | 0.0d |
| `char` | 2 bytes | 0 to 65,535 (Unicode) | '\u0000' |
| `boolean` | 1 bit | true / false | false |

---

## Non-Primitive Data Types

Reference types store object references in heap memory.

- **String**: Text data (immutable)
- **Arrays**: Collection of elements of same type
- **Classes**: User-defined or built-in objects
- **Interfaces**: Abstract types
- **Enums**: Fixed set of constants

### Default Value
All non-primitive types default to `null`.

---

## Key Differences

| Feature | Primitive | Non-Primitive |
|---------|-----------|---------------|
| Storage | Stack | Heap |
| Default Value | Type-specific | null |
| Size | Fixed | Variable |
| Examples | int, boolean | String, Array |
