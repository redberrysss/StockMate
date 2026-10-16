# StockMate

Native Kotlin inventory manager for small businesses. It demonstrates Compose/Material 3, Room persistence, Flow-backed MVVM, Navigation Compose, DataStore-ready preferences, and a Retrofit-ready integration boundary.

## Features

- Dashboard with product, stock, value, low-stock and recent-activity summaries.
- Add products, adjust incoming/outgoing stock, guard against negative stock, and retain movement history.
- Category filter and search, plus low-stock visual indicators and a lightweight category chart.
- Demo inventory is seeded once for recruiter exploration. Barcode association is supported through manual SKU entry; camera scanning can be added behind a ML Kit dependency when camera permission/product requirements are available.

## Architecture and data

`data/local` (Room entities/DAO/database) → repository → `StockViewModel` StateFlow → Compose UI. Product records hold name/SKU/category/prices/quantity; movements form an audit trail.

## Run and test

Open this folder in Android Studio, select the bundled JDK (17+), sync and run `app`. From a terminal: `./gradlew assembleDebug test lint`. Screenshots can be added in `docs/screenshots/` for GitHub presentation.

## Screenshots

Capture the Dashboard, Products, and Activity tabs after running the seeded demo, then place images under `docs/screenshots/`.

## Limitations / next steps

The analytics chart is a native Compose bar visualization to avoid a heavy chart SDK. Barcode camera scanning and cloud sync are intentionally not represented as completed without scanner configuration/backend credentials.
