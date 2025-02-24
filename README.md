# PidtMC

PidtMC is a **Player Identity Tracking Tool** for Minecraft. It allows players to track other players within their render distance and provides this information to a Discord bot, which can notify others when a tracked player is nearby.

## Features
- Tracks only players that are **not** in the known players list.
- Integrates with a Discord bot for real-time notifications.
- Helps identify and monitor unfamiliar players without server-side modifications.
- Supports both Fabric and Forge through Architectury.

## Installation
1. Download the latest version of PidtMC from the [releases](#) page.
2. Place the mod `.jar` file into your Minecraft `mods` folder.
3. Ensure you have Minecraft 1.20.4 running with **Forge** or **Fabric**.
4. Configure the mod as needed (see [Configuration](#configuration)).

## Configuration
PidtMC requires a connection to a Discord bot to send notifications. You'll need to set up a bot and provide its token in the configuration file.

1. Generate a Discord bot token from the [Discord Developer Portal](https://discord.com/developers).
2. Edit the `config/pidtmc.json` file and enter the bot token and the channel ID where notifications should be sent.
3. Restart Minecraft for changes to take effect.

## Usage
Once installed and configured:
- The mod will automatically detect players entering your render distance.
- If a player **not** on your known players list is detected, a notification will be sent to the specified Discord channel.
- You can manually manage your known players list using the following commands.

## Commands
| Command | Description |
|---------|-------------|
| `/pidt add knownPlayers <playername>` | Add a player to the known players list (they will not trigger notifications). |
| `/pidt remove knownPlayers <playername>` | Remove a player from the known players list (they will trigger notifications if seen). |
| `/pidt list knownPlayers` | View all players currently in the known players list. |

## Notes
- PidtMC does **not** require server-side installation; it works entirely on the client.
- The mod only detects players that are within your render distance—players outside of that range will not be tracked.
- Ensure your Discord bot has the correct permissions to send messages to the configured channel.

## Contributing
Contributions are welcome! If you find a bug or have a feature request, feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
