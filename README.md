# LobbyCommand

Sends players to the configured lobby using BungeeCord plugin messaging.

## Requirements

- Spigot 26.3 or a compatible Paper 26.3 server
- Java 25
- Maven 3.9+ to build
- A proxy with BungeeCord-compatible plugin messaging enabled and the target server configured

## Build and install

Run `mvn -B -ntp clean verify` with JDK 25. Copy
`target/LobbyCommand-1.0.jar` into `plugins/` and restart the server.
Set `server` and `message` in `plugins/LobbyCommand/config.yml`.
Players can use `/lobby` or `/l` with the `lobby.use` permission.
