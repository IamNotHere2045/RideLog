# APK ohne PC erstellen (Android-Handy)

Das ZIP ist ein Android-Studio-Quellprojekt, keine installierbare APK. Mit GitHub Actions kann GitHub die APK in der Cloud bauen.

1. GitHub-Konto im Browser erstellen/anmelden.
2. Neues Repository erstellen und den Namen `RideLog` verwenden.
3. Projektdateien in das Repository hochladen (Ordnerinhalt, nicht das ZIP als einzelne Datei). Achte darauf, dass `.github/workflows/build-apk.yml` mit hochgeladen wird.
4. Im Repository **Actions** öffnen und **Build RideLog APK** auswählen.
5. **Run workflow** antippen und warten, bis der Lauf grün abgeschlossen ist.
6. Im abgeschlossenen Lauf unter **Artifacts** `RideLog-debug-apk` herunterladen.
7. ZIP entpacken, `app-debug.apk` antippen und Android-Installationshinweise bestätigen.

Hinweis: Die GitHub-Oberfläche auf dem Handy kann das Hochladen vieler Dateien/Ordner umständlich machen. Wenn das nicht klappt, ist ein PC oder ein anderer Cloud-Build-Dienst nötig. APK nur aus deinem eigenen Repository installieren.
