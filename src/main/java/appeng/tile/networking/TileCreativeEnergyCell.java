package appeng.tile.networking;

import net.minecraftforge.common.util.ForgeDirection;
import appeng.api.config.AccessRestriction;
import appeng.api.config.Actionable;
import appeng.api.config.PowerMultiplier;
import appeng.api.networking.energy.IAEPowerStorage;
import appeng.api.util.AECableType;
import appeng.tile.grid.AENetworkTile;

public class TileCreativeEnergyCell extends AENetworkTile implements IAEPowerStorage
{

	public TileCreativeEnergyCell() {
		gridProxy.setIdlePowerUsage( 0 );
	}

	@Override
	public AECableType getCableConnectionType(ForgeDirection dir)
	{
		return AECableType.COVERED;
	}

	@Override
	public double injectAEPower(double amt, Actionable mode)
	{
		return 0;
	}

	@Override
	public double extractAEPower(double amt, Actionable mode, PowerMultiplier pm)
	{
		return amt;
	}

	@Override
	public double getAEMaxPower()
	{
		return Long.MAX_VALUE / 10000;
	}

	@Override
	public double getAECurrentPower()
	{
		return Long.MAX_VALUE / 10000;
	}

	@Override
	public boolean isAEPublicPowerStorage()
	{
		return true;
	}

	@Override
	public AccessRestriction getPowerFlow()
	{
		return AccessRestriction.READ_WRITE;
	}

}
