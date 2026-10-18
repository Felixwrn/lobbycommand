LobbyCommand 1.0 updated for Minecraft 26.3 and Java 25.

Requires Spigot 26.3 or a compatible Paper 26.3 server and Java 25. The proxy
must support BungeeCord plugin messaging and have the lobby destination
configured. Copy `LobbyCommand-1.0.jar` into the server's `plugins/` directory,
restart the server, and set `server` and `message` in
`plugins/LobbyCommand/config.yml`. Players need the `lobby.use` permission.

The JAR is built from this release tag with `mvn -B -ntp clean verify`.
`SHA256SUMS` contains its SHA-256 checksum. Compilation and the Maven verification
lifecycle passed; an in-game server test was not performed.
